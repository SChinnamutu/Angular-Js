'use strict';
myApp.controller('StudentController', function ($scope, StudentDataOp) {
    $scope.status = [] ;
    $scope.students = [];
    getStudents();

    function getStudents() {
        StudentDataOp.getStudents()
            .success(function (studs) {
            	$scope.students = studs;
            })
            .error(function (error) {
                $scope.status = 'Unable to load customer data: ' + error.message;
            });
    }

    $scope.addStudent = function () {
        var stud = {
            id: $scope.sid,
            firstName: $scope.fname,
            lastName: $scope.lname
        };
        StudentDataOp.addStudent(stud)
            .success(function () {
                $scope.status = 'Inserted Student! Refreshing Student list.';
                $scope.students.push(stud);
                _clearFormData();
            }).
            error(function (error) {
                $scope.status = 'Unable to insert Student: ' + error.message;
                _clearFormData();
            });
    };
    
    function _clearFormData() {
        $scope.sid = "";
        $scope.fname = "";
        $scope.lname = "";
    
    };
    
    $scope.deleteStudent = function (id) {
    	StudentDataOp.deleteStudent(id)
            .success(function (stud) {
                $scope.status = 'Inserted Student! Refreshing Student list.';
                $scope.students.push(stud);
            }).
            error(function (error) {
                $scope.status = 'Unable to insert Student: ' + error.message;
            });
    };
    
    $scope.edit = function (id) {
    	StudentDataOp.get(id)
        .success(function (stud) {
            $scope.status = 'Inserted Student! Refreshing Student list.';
            $scope.sid = stud.id;
            $scope.fname = stud.firstName;
            $scope.lname = stud.lastName;
        }).
        error(function (error) {
            $scope.status = 'Unable to insert Student: ' + error.message;
        });
    };
    
    
    
    
});


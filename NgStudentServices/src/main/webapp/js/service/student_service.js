'use strict';
var StudentService = angular.module('StudentService', []);
	StudentService.factory('StudentDataOp', ['$http', function ($http) {
    var urlBase = 'http://localhost:8082/JAXRestServices/rest/students';
    var StudentDataOp = {};
   
    StudentDataOp.getStudents = function () {
        return $http.get(urlBase+'/GetStudents');
    };

    StudentDataOp.addStudent = function (stud) {
        return $http.post(urlBase + '/AddStudent', stud);
    };
    
    StudentDataOp.updateStudent = function (stud) {
        return $http.put(urlBase + '/UpdateStudent', stud);
    };
    
    StudentDataOp.deleteStudent = function (id) {
       // return $http.post(urlBase + '/DeleteStudent/'+ id );
       return $http({
            method : 'DELETE',
            url : 'rest/students/' + id
        });
    };
    
    StudentDataOp.get = function (id) {
        return $http.get(urlBase + '/GetStudentById/' + id);
    };
    
    return StudentDataOp;
}]);
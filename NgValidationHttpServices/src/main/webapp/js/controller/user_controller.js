'use strict';
module.controller('AppController', function ($scope, UserDataOp) {
	$scope.users = [];
     _refreshUserData();
    function _refreshUserData() {
    	UserDataOp._refreshUserData()
            .success(function (users) {
            	$scope.users = users;
            })
            .error(function (error) {
                $scope.status = 'Unable to load users data: ' + error.message;
            });
    };
    
});


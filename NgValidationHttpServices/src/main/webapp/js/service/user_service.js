'use strict';
var UserService = angular.module('UserService', []);
	UserService.factory('UserDataOp', ['$http', function ($http) {
    var urlBase = 'http://localhost:8082/StudentRestServices/rest/users';
    var UserDataOp = {};
    UserDataOp._refreshUserData = function () {
        return $http.get(urlBase);
    };
    return UserDataOp;
}]);
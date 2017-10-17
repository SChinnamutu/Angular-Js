'use strict';
var StudentService = angular.module('StudentService', []);
	StudentService.factory('StudentDataOp', ['$http', function ($http) {
    var urlBase = 'http://localhost:8082/StudentRestServices/rest/countries';
    var StudentDataOp = {};
    StudentDataOp._refreshCountryData = function () {
        return $http.get(urlBase);
    };
    StudentDataOp.addCountry = function (country) {
       return $http.post(urlBase,country);
    };
    StudentDataOp.deleteCountry = function (country) {
        return $http({
            method : 'DELETE',
            data : country,
            url : urlBase
        });
     };
    return StudentDataOp;
}]);
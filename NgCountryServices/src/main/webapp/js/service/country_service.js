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
    
    StudentDataOp.deleteCountry = function (id) {
         return $http({
              method : 'DELETE',
              url :  'rest/countries/'  + id
          });
    };
    
    StudentDataOp.editCountry = function (id) {
        return $http({
             method : 'GET',
             url :  'rest/countries/'  + id
         });
   };
    return StudentDataOp;
}]);
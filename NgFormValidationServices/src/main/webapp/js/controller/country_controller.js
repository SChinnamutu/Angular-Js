'use strict';
module.controller('CountryController', function ($scope, StudentDataOp) {
	$scope.status; 
	$scope.countries = [];
    
     _refreshCountryData();
     
    function _refreshCountryData() {
    	StudentDataOp._refreshCountryData()
            .success(function (countries) {
            	$scope.countries = countries;
            })
            .error(function (error) {
                $scope.status = 'Unable to load customer data: ' + error.message;
            });
    };
    
    $scope.addCountry = function () {
    	$scope.countryForm = { 
    	         id : $scope.countryForm.countryId,
    	         countryName : $scope.countryForm.countryName,
    	         population :  $scope.countryForm.population
    	};
    	
    	StudentDataOp.addCountry($scope.countryForm)
            .success(function (countries) {
            	$scope.countries = countries;
            	_clearFormData;
            })
            .error(function (error) {
                $scope.status = 'Unable to load country data: ' + error.message;
            });
    };
    
    $scope.deleteCountry = function (country) {
    	alert(country);
    	StudentDataOp.deleteCountry(country)
            .success(function (countries) {
            	$scope.countries = countries;
            	//_clearFormData;
            })
            .error(function (error) {
                $scope.status = 'Unable to load country data: ' + error.message;
            });
    };

    
    function _clearFormData() {
    	alert("in");
    	$scope.countryForm.clear();
    };
    
});


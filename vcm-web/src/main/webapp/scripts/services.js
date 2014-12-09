services = angular.module('vcm.services', ['ngResource']);

services.factory('Users', ['$resource', function($resource){
	return $resource('http://localhost:18080/vcm-web/rest/user/all');
}]);

services.factory('AddUser', ['$resource', function($resource){
	return $resource('http://localhost:18080/vcm-web/rest/user');
}]);


services.factory('LoadAllUsers', ['Users', '$q', function(Users, $q){
	return function(){
		var defered = $q.defer();
		Users.get(
				function(users){
					defered.resolve(users.user);
				}, 
				function(){
					defered.reject("Unable to fetch the users");
				});
		return defered.promise;
	};
}]);

//services.factory('AddUserLocal', ['AddUser', '$q', function(addUser, $q){
//	return function(){
//		var defered = $q.defer();
//		AddUser.save()
//	};
//}]);
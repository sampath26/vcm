app.controller("ListController", ['$scope','users', function($scope, users){
	$scope.users= users;

	$scope.addUser = function(user){
		alert(user.firstName);
	};
	
	$scope.userSelected = function($index){
		$scope.selectedItem = $index;
	};
}]);

app.controller("AddUserController", ['$scope', 'AddUser', '$location', function($scope, AddUser, $location){

	$scope.addUser = function(user){
		AddUser.save(user, function(){
			$location.path('/list');
		});
		
	};
	
}]);

app.config(['$routeProvider', function($routeProvider){
	$routeProvider.
	when('/list', {
		controller: 'ListController',
		resolve: {
			users: ["LoadAllUsers", function(LoadAllUsers){
				return LoadAllUsers();
			}]
		},
		templateUrl:'views/list.html'
	})
	.when('/create', {
		controller: 'AddUserController',
		templateUrl:'views/create.html'
	})
	.otherwise({redirectTo: '/create'});
}]);
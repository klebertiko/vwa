/**
 * Created by kleber on 14/12/16.
 */
vwa.controller('helloController', function($scope, $http) {
    $http.get('http://localhost:8080/hello/')
        .then(function (response) {
            $scope.hello = response.data;
        });
});

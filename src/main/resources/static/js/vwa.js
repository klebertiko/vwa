/**
 * Created by kleber on 14/12/16.
 */
var vwa = angular.module('vwa', ['ngRoute','ngResource']);
vwa.config(function($routeProvider) {
    $routeProvider.when('/getOla', {
        templateUrl: '/index.html',
        controller: 'helloController'
    });
});
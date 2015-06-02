'use strict';

/**
 * @ngdoc function
 * @name friendsApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the friendsApp
 */
angular.module('friendsApp')
  .controller('MainCtrl', function ($scope) {
    $scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
  });

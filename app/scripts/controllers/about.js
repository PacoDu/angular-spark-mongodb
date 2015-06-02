'use strict';

/**
 * @ngdoc function
 * @name friendsApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the friendsApp
 */
angular.module('friendsApp')
  .controller('AboutCtrl', function ($scope) {
    $scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
  });

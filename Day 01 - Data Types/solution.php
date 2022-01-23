<?php
$handle = fopen ("php://stdin","r");
$i = 4;
$d = 4.0;
$s = "HackerRank ";
// Declare second integer, double, and String variables.
$fp = fopen("php://stdin","r");
$j = (int)readline();
$e = (float)readline();
$t = readline();

// Read and save an integer, double, and String to your variables.

// Print the sum of both integer variables on a new line.
print($i+$j."\n");
// Print the sum of the double variables on a new line.
print(sprintf("%.1f",$e+$d)."\n");
// Concatenate and print the String variables on a new line
// The 's' variable above should be printed first.
print($s.$t);
fclose($handle);
?>
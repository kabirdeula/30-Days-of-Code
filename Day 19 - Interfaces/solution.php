<?php

interface AdvancedArithmetic
{
    public function divisorSum($n);
}

class Calculator implements AdvancedArithmetic{
    function divisorSum($n){
        $res = [];
        for($i = 1; $i <= $n; $i++){
            if($n % $i === 0){
                $res[] = $i;
            }
        }
        return array_sum($res);
    }
}

$n = intval(fgets(STDIN));
$myCalculator = new Calculator();
if ($myCalculator instanceof AdvancedArithmetic) {
    $sum = $myCalculator->divisorSum($n);
    echo 'I implemented: AdvancedArithmetic' . PHP_EOL . $sum;
}else{
    echo 'Wrong answer';
}
?>
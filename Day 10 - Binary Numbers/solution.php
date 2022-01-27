<?php

$n = intval(trim(fgets(STDIN)
));

$s = explode('0',decbin($n));
echo strlen(max($s));
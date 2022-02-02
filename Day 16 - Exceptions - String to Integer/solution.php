<?php

$S = rtrim(fgets(STDIN), "\r\n");
echo ctype_digit($S) ? $S : 'Bad String';
(ns acripps.euler.problems.p003.prime-factor-test
  (:use midje.sweet)
  (:require [acripps.euler.problems.p003.prime-factor :as prime]))



(facts "about get-primes"
       (fact "returns a list of primes below the given number"
             (prime/get-primes 5) => [2 3]
             (prime/get-primes 100) => [2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97]))

(facts "about get-factors"
       (fact "4 has factors [2 2]"
             (prime/get-factors 4) => [2 2])
       (fact "6 has factors [2 3]"
             (prime/get-factors 6) => [2 3])
       (fact "12 has factors [2 2 3]"
             (prime/get-factors 12) => [2 2 3])
       (fact "13195 has factors [5 7 13 29]"
             (prime/get-factors 13195) => [5 7 13 29]))
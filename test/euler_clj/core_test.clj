(ns euler-clj.core-test
  (:require [clojure.test :refer :all]
            [euler-clj.core :refer :all]))

(deftest problem-001
  (testing "Problem 001"
    (is (= (run-problem 1) 233168))))

(deftest problem-002
  (testing "Problem 002"
    (is (= (run-problem 2) 4613732))))

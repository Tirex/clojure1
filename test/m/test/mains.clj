(ns m.test.mains
  (:use [clojure.test])
  (:require [m.mains :as ms])
  )


(deftest testf-text
  (is true (= (ms/testf "1" ) "11")))

(deftest getv-for-valid
  (is true (= (ms/getv 0) "0"))
  (is true (= (ms/getv 1) "1"))
  (is true (= (ms/getv 2) "1"))
  (is false (= (ms/getv 2) "0"))
  )
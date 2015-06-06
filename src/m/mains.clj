(ns m.mains
  (:use [clojure.test]))


(defn testf [text]
  (str text "1") )

(defn getv [i]
  (if (= i 0)
    "0"
    "1"))

(defn getv-by-text [t]
  (let [t (testf t)])
    (getv t))

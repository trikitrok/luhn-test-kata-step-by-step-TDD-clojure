(ns luhn-test.core-test
  (:require [midje.sweet :refer :all]
            [luhn-test.core :as luhn]))

(facts
  "about luhn test"
  (luhn/valid? "0") => true
  (luhn/valid? "1") => false)
(ns luhn-test.core-test
  (:require [midje.sweet :refer :all]
            [luhn-test.core :as luhn]))

(facts
  "about luhn test"
  (luhn/valid? "0") => true?
  (luhn/valid? "1") =not=> true?
  (luhn/valid? "18") => true?
  (luhn/valid? "612") => true?
  (luhn/valid? "1016") => true?
  (luhn/valid? "4044") => true?
  (luhn/valid? "91") => true?
  (luhn/valid? "49927398716") => true?
  (luhn/valid? "79927398713") => true?
  (luhn/valid? "49927398712") =not=> true?
  (luhn/valid? "79927398715") =not=> true?)
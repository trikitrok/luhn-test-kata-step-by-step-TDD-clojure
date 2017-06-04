(ns luhn-test.core-test
  (:require [midje.sweet :refer :all]
            [luhn-test.core :as luhn]))

(facts
  "about luhn test"
  (luhn/valid? "00000000000") => true?
  (luhn/valid? "00000000001") =not=> true?
  (luhn/valid? "00000000505") => true?
  (luhn/valid? "00000000018") => true?
  (luhn/valid? "00000002030") => true?
  (luhn/valid? "00000000091") => true?
  (luhn/valid? "49927398716") => true?
  (luhn/valid? "79927398713") => true?
  (luhn/valid? "49927398712") =not=> true?
  (luhn/valid? "79927398715") =not=> true?)

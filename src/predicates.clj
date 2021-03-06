(ns predicates)

(defn sum-f [f g x]
  (+ (f x) (g x))
  )

(defn less-than [n]
  (fn [k] (< k n)))

(defn equal-to [n]
  (fn [k] (== k n)))

(defn set->predicate [a-set]
  (fn [x] (contains? a-set x)))

(defn pred-and [pred1 pred2]
  (fn [x] (and (if (pred1 x) (pred2 x)))))

(defn pred-or [pred1 pred2]
  )

(defn whitespace? [character]
  (Character/isWhitespace character))

(defn blank? [string]
  (if (every? whitespace? string)
      true
      false))

(defn has-award? [book award]
  (if (contains? (:awards book) award)
        true
        false))

(defn HAS-ALL-THE-AWARDS? [book awards]
  (if (every? (:awards book) awards)
    true
    false))

(defn my-some [pred a-seq]
  (first (filter pred a-seq)))

(defn my-every? [pred a-seq]
  :-)

(defn prime? [n]
  :-)
;^^

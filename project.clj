(defproject predicates "1.0.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [iloveponies.tests/predicates "0.1.0-SNAPSHOT"]
                 [midje "1.9.8"]]
  :profiles {:dev {:plugins [[lein-midje "3.2.1"]]}})
(defproject clojure-programming "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot clojure-programming.core
  :target-path "target/%s"
  :repl-options {
    :prompt (fn [ns] (str "\u001B[32m" ns "\u001B[m=> " ))}
  :profiles {:uberjar {:aot :all}})

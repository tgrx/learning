(defproject hashes "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"][pandect "0.6.1"][org.bouncycastle/bcprov-jdk15on "1.54"]]
  :main ^:skip-aot hashes.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}
             :provided {:dependencies [[org.bouncycastle/bcprov-jdk15on "1.54"]]}})


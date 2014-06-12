(ns immutant.init
  (:require
   [immutant.web :as web]
   [cider-nrepl-exception.core :refer [my-handler]]))

(web/start my-handler)

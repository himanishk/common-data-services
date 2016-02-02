package com.hk.test

import com.typesafe.config.ConfigFactory

/**
  * Copyright (C) 2014 MediaMath <http://www.mediamath.com> 
  * Created by hkushary on 2/2/16.
  */
trait LocalConfigSettings {
  def environmentStr = sys.props.get("MM_EXEC_ENV").getOrElse("test").toLowerCase
  def config = ConfigFactory.load(environmentStr)
}

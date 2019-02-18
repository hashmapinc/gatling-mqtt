package com.github.mnogu.gatling.mqtt.protocol

import io.gatling.core.protocol.ProtocolComponents
import io.gatling.core.session.Session

/**
  *
  */
case class MqttComponents(mqttProtocol: MqttProtocol) extends ProtocolComponents {
    override def onStart: (Session) => Session = ProtocolComponents.NoopOnStart

    override def onExit: (Session) => Unit = ProtocolComponents.NoopOnExit
}

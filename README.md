## How to reproduce the issue

- `./gradlew run`

on another terminal:
- `npm install artillery`
- `node_modules/.bin/artillery run loadtest.yml`

error:
```
java.lang.NullPointerException: null
    at io.micronaut.http.bind.binders.DelegatingCoroutineContext.get(ContinuationArgumentBinder.kt:105)
    at kotlinx.coroutines.CancellableContinuationImpl.installParentHandle(CancellableContinuationImpl.kt:306)
    at kotlinx.coroutines.CancellableContinuationImpl.initCancellability(CancellableContinuationImpl.kt:98)
    at kotlinx.coroutines.DelayKt.delay(Delay.kt:166)
    at com.example.WebsocketController.messageHandler(WebsocketController.kt:12)
    at com.example.$WebsocketController$Definition$Exec.dispatch(Unknown Source)
    at io.micronaut.context.AbstractExecutableMethodsDefinition$DispatchedExecutableMethod.invoke(AbstractExecutableMethodsDefinition.java:378)
    at io.micronaut.core.bind.DefaultExecutableBinder$1.invoke(DefaultExecutableBinder.java:109)
    at io.micronaut.http.server.netty.websocket.NettyServerWebSocketHandler.lambda$invokeExecutable0$6(NettyServerWebSocketHandler.java:349)
    at io.micronaut.http.context.ServerRequestContext.with(ServerRequestContext.java:103)
    at io.micronaut.http.server.netty.websocket.NettyServerWebSocketHandler.invokeExecutable0(NettyServerWebSocketHandler.java:348)
    at io.micronaut.http.server.netty.websocket.NettyServerWebSocketHandler.lambda$invokeExecutable$5(NettyServerWebSocketHandler.java:330)
    at reactor.core.publisher.FluxDeferContextual.subscribe(FluxDeferContextual.java:49)
    at reactor.core.publisher.Flux.subscribe(Flux.java:8660)
    at io.micronaut.http.server.netty.websocket.NettyServerWebSocketHandler.lambda$instrumentPublisher$3(NettyServerWebSocketHandler.java:283)
    at io.micronaut.http.context.ServerRequestContext.with(ServerRequestContext.java:68)
    at io.micronaut.http.server.netty.websocket.NettyServerWebSocketHandler.lambda$instrumentPublisher$4(NettyServerWebSocketHandler.java:282)
    at reactor.core.publisher.FluxSource.subscribe(FluxSource.java:67)
    at reactor.core.publisher.InternalFluxOperator.subscribe(InternalFluxOperator.java:62)
    at reactor.core.publisher.FluxSubscribeOn$SubscribeOnSubscriber.run(FluxSubscribeOn.java:194)
    at io.micronaut.reactive.reactor.instrument.ReactorInstrumentation.lambda$init$0(ReactorInstrumentation.java:62)
    at reactor.core.scheduler.WorkerTask.call(WorkerTask.java:84)
    at reactor.core.scheduler.WorkerTask.call(WorkerTask.java:37)
    at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:96)
    at io.netty.util.concurrent.PromiseTask.run(PromiseTask.java:106)
    at io.netty.util.concurrent.AbstractEventExecutor.runTask(AbstractEventExecutor.java:174)
    at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:167)
    at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:470)
    at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:566)
    at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)
    at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
    at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
    at java.base/java.lang.Thread.run(Thread.java:1589)
```

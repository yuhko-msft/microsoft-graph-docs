---
description: "Automatically generated file. DO NOT MODIFY"
---
<!-- markdownlint-disable MD041 -->

```java
GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

String callbackUri = "callbackUri-value";

AppHostedMediaConfig mediaConfig = new AppHostedMediaConfig();
mediaConfig.blob = "<Media Session Configuration Blob>";

LinkedList<Modality> acceptedModalitiesList = new LinkedList<Modality>();
acceptedModalitiesList.add(Modality.AUDIO);

int participantCapacity = 200;

graphClient.communications().calls("{id}")
    .answer(CallAnswerParameterSet
        .newBuilder()
        .withCallbackUri(callbackUri)
        .withMediaConfig(mediaConfig)
        .withAcceptedModalities(acceptedModalitiesList)
        .withParticipantCapacity(participantCapacity)
        .withCallOptions(null)
        .build())
    .buildRequest()
    .post();
```

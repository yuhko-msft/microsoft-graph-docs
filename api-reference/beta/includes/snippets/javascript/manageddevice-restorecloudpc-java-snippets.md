---
description: "Automatically generated file. DO NOT MODIFY"
---

```java

GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

String cloudPcSnapshotId = "A00009UV000_93aff428-61f2-467f-a879-1102af6fd4a8";

graphClient.deviceManagement().managedDevices("{managedDeviceId}")
	.restoreCloudPc(ManagedDeviceRestoreCloudPcParameterSet
		.newBuilder()
		.withTargetServicePlanId(targetServicePlanId)
		.withCloudPcSnapshotId(cloudPcSnapshotId)
		.build())
	.buildRequest()
	.post();

```
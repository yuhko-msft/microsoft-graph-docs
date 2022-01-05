---
description: "Automatically generated file. DO NOT MODIFY"
---

```javascript

const options = {
	authProvider,
};

const client = Client.init(options);

const restoreCloudPc = {
  cloudPcSnapshotId: 'A00009UV000_93aff428-61f2-467f-a879-1102af6fd4a8'
};

await client.api('/deviceManagement/managedDevices/{managedDeviceId}/restoreCloudPc')
	.version('beta')
	.post(restoreCloudPc);

```
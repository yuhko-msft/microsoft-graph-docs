---
title: "Create mobileAppInstallStatus"
description: "Create a new mobileAppInstallStatus object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create mobileAppInstallStatus
Namespace: microsoft.graph



Create a new mobileAppInstallStatus object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST /deviceAppManagement/mobileApps/{mobileAppId}/deviceStatuses
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mobileAppInstallStatus](../resources/mobileappinstallstatus.md) object.

The following table shows the properties that are required when you create the [mobileAppInstallStatus](../resources/mobileappinstallstatus.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deviceId|String|Device ID|
|deviceName|String|Device name|
|displayVersion|String|Human readable version of the application|
|errorCode|Int32|The error code for install or uninstall failures.|
|installState|resultantAppState|The install state of the app. Possible values are: `notApplicable`, `installed`, `failed`, `notInstalled`, `uninstallFailed`, `pendingInstall`, `unknown`.|
|installStateDetail|resultantAppStateDetail|The install state detail of the app. Possible values are: `processorArchitectureNotApplicable`, `minimumDiskSpaceNotMet`, `minimumOsVersionNotMet`, `minimumPhysicalMemoryNotMet`, `minimumLogicalProcessorCountNotMet`, `minimumCpuSpeedNotMet`, `platformNotApplicable`, `fileSystemRequirementNotMet`, `registryRequirementNotMet`, `powerShellScriptRequirementNotMet`, `noAdditionalDetails`, `dependencyFailedToInstall`, `dependencyWithRequirementsNotMet`, `dependencyPendingReboot`, `dependencyWithAutoInstallDisabled`, `iosAppStoreUpdateFailedToInstall`, `vppAppHasUpdateAvailable`, `userRejectedUpdate`, `seeInstallErrorCode`, `autoInstallDisabled`, `managedAppNoLongerPresent`, `userRejectedInstall`, `userIsNotLoggedIntoAppStore`, `seeUninstallErrorCode`, `pendingReboot`, `installingDependencies`, `contentDownloaded`.|
|lastSyncDateTime|DateTimeOffset|Last sync date time|
|mobileAppInstallStatusValue|resultantAppState|The install state of the app. Possible values are: `notApplicable`, `installed`, `failed`, `notInstalled`, `uninstallFailed`, `pendingInstall`, `unknown`.|
|osDescription|String|OS Description|
|osVersion|String|OS Version|
|userName|String|Device User Name|
|userPrincipalName|String|User Principal Name|



## Response

If successful, this method returns a `201 Created` response code and a [mobileAppInstallStatus](../resources/mobileappinstallstatus.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_mobileappinstallstatus_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceAppManagement/mobileApps/{mobileAppId}/deviceStatuses
Content-Type: application/json
Content-length: 442

{
  "@odata.type": "#microsoft.graph.mobileAppInstallStatus",
  "deviceId": "String",
  "deviceName": "String",
  "displayVersion": "String",
  "errorCode": "Integer",
  "installState": "String",
  "installStateDetail": "String",
  "lastSyncDateTime": "String (timestamp)",
  "mobileAppInstallStatusValue": "String",
  "osDescription": "String",
  "osVersion": "String",
  "userName": "String",
  "userPrincipalName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.mobileAppInstallStatus"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.mobileAppInstallStatus",
  "id": "5d9c79ff-79ff-5d9c-ff79-9c5dff799c5d",
  "deviceId": "String",
  "deviceName": "String",
  "displayVersion": "String",
  "errorCode": "Integer",
  "installState": "String",
  "installStateDetail": "String",
  "lastSyncDateTime": "String (timestamp)",
  "mobileAppInstallStatusValue": "String",
  "osDescription": "String",
  "osVersion": "String",
  "userName": "String",
  "userPrincipalName": "String"
}
```


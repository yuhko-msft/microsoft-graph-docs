---
title: "Get windows10TeamGeneralConfiguration"
description: "Read the properties and relationships of a windows10TeamGeneralConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get windows10TeamGeneralConfiguration
Namespace: microsoft.graph

Read the properties and relationships of a [windows10TeamGeneralConfiguration](../resources/windows10teamgeneralconfiguration.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
GET ** Entity URI for microsoft.graph.windows10TeamGeneralConfiguration not found
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [windows10TeamGeneralConfiguration](../resources/windows10teamgeneralconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_windows10teamgeneralconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/beta** Entity URI for microsoft.graph.windows10TeamGeneralConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windows10TeamGeneralConfiguration"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
    "@odata.type": "#microsoft.graph.windows10TeamGeneralConfiguration",
    "id": "fa24aa6d-aa6d-fa24-6daa-24fa6daa24fa",
    "lastModifiedDateTime": "String (timestamp)",
    "roleScopeTagIds": [
      "String"
    ],
    "supportsScopeTags": "Boolean",
    "deviceManagementApplicabilityRuleOsEdition": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
    },
    "deviceManagementApplicabilityRuleOsVersion": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
    },
    "deviceManagementApplicabilityRuleDeviceMode": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
    },
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "displayName": "String",
    "version": "Integer",
    "azureOperationalInsightsBlockTelemetry": "Boolean",
    "azureOperationalInsightsWorkspaceId": "String",
    "azureOperationalInsightsWorkspaceKey": "String",
    "connectAppBlockAutoLaunch": "Boolean",
    "maintenanceWindowBlocked": "Boolean",
    "maintenanceWindowDurationInHours": "Integer",
    "maintenanceWindowStartTime": "String (time of day)",
    "miracastChannel": "String",
    "miracastBlocked": "Boolean",
    "miracastRequirePin": "Boolean",
    "settingsBlockMyMeetingsAndFiles": "Boolean",
    "settingsBlockSessionResume": "Boolean",
    "settingsBlockSigninSuggestions": "Boolean",
    "settingsDefaultVolume": "Integer",
    "settingsScreenTimeoutInMinutes": "Integer",
    "settingsSessionTimeoutInMinutes": "Integer",
    "settingsSleepTimeoutInMinutes": "Integer",
    "welcomeScreenBlockAutomaticWakeUp": "Boolean",
    "welcomeScreenBackgroundImageUrl": "String",
    "welcomeScreenMeetingInformation": "String"
  }
}
```


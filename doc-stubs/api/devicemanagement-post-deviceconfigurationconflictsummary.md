---
title: "Create deviceConfigurationConflictSummary"
description: "Create a new deviceConfigurationConflictSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceConfigurationConflictSummary
Namespace: microsoft.graph



Create a new deviceConfigurationConflictSummary object.

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
POST /deviceManagement/deviceConfigurationConflictSummary
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceConfigurationConflictSummary](../resources/deviceconfigurationconflictsummary.md) object.

The following table shows the properties that are required when you create the [deviceConfigurationConflictSummary](../resources/deviceconfigurationconflictsummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|conflictingDeviceConfigurations|[settingSource](../resources/settingsource.md) collection|The set of policies in conflict with the given setting|
|contributingSettings|String collection|The set of settings in conflict with the given policies|
|deviceCheckinsImpacted|Int32|The count of checkins impacted by the conflicting policies and settings|



## Response

If successful, this method returns a `201 Created` response code and a [deviceConfigurationConflictSummary](../resources/deviceconfigurationconflictsummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_deviceconfigurationconflictsummary_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/deviceConfigurationConflictSummary
Content-Type: application/json
Content-length: 279

{
  "@odata.type": "#microsoft.graph.deviceConfigurationConflictSummary",
  "conflictingDeviceConfigurations": [
    {
      "@odata.type": "microsoft.graph.settingSource"
    }
  ],
  "contributingSettings": [
    "String"
  ],
  "deviceCheckinsImpacted": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceConfigurationConflictSummary"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceConfigurationConflictSummary",
  "id": "2e0df096-f096-2e0d-96f0-0d2e96f00d2e",
  "conflictingDeviceConfigurations": [
    {
      "@odata.type": "microsoft.graph.settingSource"
    }
  ],
  "contributingSettings": [
    "String"
  ],
  "deviceCheckinsImpacted": "Integer"
}
```


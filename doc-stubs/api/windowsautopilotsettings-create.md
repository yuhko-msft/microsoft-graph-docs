---
title: "Create windowsAutopilotSettings"
description: "Create a new windowsAutopilotSettings object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsAutopilotSettings
Namespace: microsoft.graph



Create a new [windowsAutopilotSettings](../resources/windowsautopilotsettings.md) object.

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
POST ** Collection URI for microsoft.graph.windowsAutopilotSettings not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsAutopilotSettings](../resources/windowsautopilotsettings.md) object.

The following table shows the properties that are required when you create the [windowsAutopilotSettings](../resources/windowsautopilotsettings.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastManualSyncTriggerDateTime|DateTimeOffset|Last data sync date time with DDS service.|
|lastSyncDateTime|DateTimeOffset|Last data sync date time with DDS service.|
|syncStatus|windowsAutopilotSyncStatus|Indicates the status of sync with Device data sync (DDS) service. Possible values are: `unknown`, `inProgress`, `completed`, `failed`.|



## Response

If successful, this method returns a `201 Created` response code and a [windowsAutopilotSettings](../resources/windowsautopilotsettings.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsautopilotsettings_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.windowsAutopilotSettings not found
Content-Type: application/json
Content-length: 196

{
  "@odata.type": "#microsoft.graph.windowsAutopilotSettings",
  "lastManualSyncTriggerDateTime": "String (timestamp)",
  "lastSyncDateTime": "String (timestamp)",
  "syncStatus": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsAutopilotSettings"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsAutopilotSettings",
  "id": "0b647845-7845-0b64-4578-640b4578640b",
  "lastManualSyncTriggerDateTime": "String (timestamp)",
  "lastSyncDateTime": "String (timestamp)",
  "syncStatus": "String"
}
```


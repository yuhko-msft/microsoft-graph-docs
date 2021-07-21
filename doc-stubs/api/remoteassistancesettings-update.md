---
title: "Update remoteAssistanceSettings"
description: "Update the properties of a remoteAssistanceSettings object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update remoteAssistanceSettings
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [remoteAssistanceSettings](../resources/remoteassistancesettings.md) object.

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
PATCH /deviceManagement/remoteAssistanceSettings
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [remoteAssistanceSettings](../resources/remoteassistancesettings.md) object.

The following table shows the properties that are required when you update the [remoteAssistanceSettings](../resources/remoteassistancesettings.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|allowSessionsToUnenrolledDevices|Boolean| Indicates if sessions to unenrolled devices are allowed for the account. This setting is configurable by the admin. Default value is false.|
|remoteAssistanceState|remoteAssistanceState|The current state of remote assistance for the account. Possible values are: notConfigured, disabled, enabled. This setting is configurable by the admin. Remote assistance settings that have not yet been configured by the admin have a notConfigured state. Returned by default. Possible values are: `notConfigured`, `disabled`, `enabled`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [remoteAssistanceSettings](../resources/remoteassistancesettings.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_remoteassistancesettings"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement/remoteAssistanceSettings
Content-Type: application/json
Content-length: 154

{
  "@odata.type": "#microsoft.graph.remoteAssistanceSettings",
  "allowSessionsToUnenrolledDevices": "Boolean",
  "remoteAssistanceState": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.remoteAssistanceSettings",
  "id": "3bdb0758-0758-3bdb-5807-db3b5807db3b",
  "allowSessionsToUnenrolledDevices": "Boolean",
  "remoteAssistanceState": "String"
}
```


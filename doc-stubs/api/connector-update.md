---
title: "Update connector"
description: "Update the properties of a connector object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update connector
Namespace: microsoft.graph



Update the properties of a [connector](../resources/connector.md) object.

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
PATCH /applications/{applicationsId}/connectorGroup/members/{connectorId}
PATCH /onPremisesPublishingProfiles/{onPremisesPublishingProfilesId}/connectors/{connectorId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [connector](../resources/connector.md) object.

The following table shows the properties that are required when you update the [connector](../resources/connector.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|externalIp|String|**TODO: Add Description**|
|machineName|String|**TODO: Add Description**|
|status|connectorStatus|**TODO: Add Description**. Possible values are: `active`, `inactive`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [connector](../resources/connector.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_connector"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/applications/{applicationsId}/connectorGroup/members/{connectorId}
Content-Type: application/json
Content-length: 129

{
  "@odata.type": "#microsoft.graph.connector",
  "externalIp": "String",
  "machineName": "String",
  "status": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.connector",
  "id": "72bb7735-7735-72bb-3577-bb723577bb72",
  "externalIp": "String",
  "machineName": "String",
  "status": "String"
}
```


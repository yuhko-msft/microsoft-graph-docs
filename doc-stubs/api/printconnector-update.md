---
title: "Update printConnector"
description: "Update the properties of a printConnector object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update printConnector
Namespace: microsoft.graph



Update the properties of a [printConnector](../resources/printconnector.md) object.

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
PATCH /print/connectors/{printConnectorId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [printConnector](../resources/printconnector.md) object.

The following table shows the properties that are required when you update the [printConnector](../resources/printconnector.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|appVersion|String|**TODO: Add Description**|
|deviceHealth|[deviceHealth](../resources/devicehealth.md)|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|fullyQualifiedDomainName|String|**TODO: Add Description**|
|location|[printerLocation](../resources/printerlocation.md)|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|operatingSystem|String|**TODO: Add Description**|
|registeredDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [printConnector](../resources/printconnector.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_printconnector"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/print/connectors/{printConnectorId}
Content-Type: application/json
Content-length: 407

{
  "@odata.type": "#microsoft.graph.printConnector",
  "appVersion": "String",
  "deviceHealth": {
    "@odata.type": "microsoft.graph.deviceHealth"
  },
  "displayName": "String",
  "fullyQualifiedDomainName": "String",
  "location": {
    "@odata.type": "microsoft.graph.printerLocation"
  },
  "name": "String",
  "operatingSystem": "String",
  "registeredDateTime": "String (timestamp)"
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
  "@odata.type": "#microsoft.graph.printConnector",
  "id": "e5f93584-3584-e5f9-8435-f9e58435f9e5",
  "appVersion": "String",
  "deviceHealth": {
    "@odata.type": "microsoft.graph.deviceHealth"
  },
  "displayName": "String",
  "fullyQualifiedDomainName": "String",
  "location": {
    "@odata.type": "microsoft.graph.printerLocation"
  },
  "name": "String",
  "operatingSystem": "String",
  "registeredDateTime": "String (timestamp)"
}
```


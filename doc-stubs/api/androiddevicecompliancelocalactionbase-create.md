---
title: "Create androidDeviceComplianceLocalActionBase"
description: "Create a new androidDeviceComplianceLocalActionBase object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create androidDeviceComplianceLocalActionBase
Namespace: microsoft.graph



Create a new [androidDeviceComplianceLocalActionBase](../resources/androiddevicecompliancelocalactionbase.md) object.

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
POST ** Collection URI for microsoft.graph.androidDeviceComplianceLocalActionBase not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [androidDeviceComplianceLocalActionBase](../resources/androiddevicecompliancelocalactionbase.md) object.

The following table shows the properties that are required when you create the [androidDeviceComplianceLocalActionBase](../resources/androiddevicecompliancelocalactionbase.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|gracePeriodInMinutes|Int32|Number of minutes to wait till a local action is enforced. Valid values 0 to 2147483647|



## Response

If successful, this method returns a `201 Created` response code and an [androidDeviceComplianceLocalActionBase](../resources/androiddevicecompliancelocalactionbase.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_androiddevicecompliancelocalactionbase_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.androidDeviceComplianceLocalActionBase not found
Content-Type: application/json
Content-length: 118

{
  "@odata.type": "#microsoft.graph.androidDeviceComplianceLocalActionBase",
  "gracePeriodInMinutes": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.androidDeviceComplianceLocalActionBase"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.androidDeviceComplianceLocalActionBase",
  "id": "ea72bf8e-bf8e-ea72-8ebf-72ea8ebf72ea",
  "gracePeriodInMinutes": "Integer"
}
```


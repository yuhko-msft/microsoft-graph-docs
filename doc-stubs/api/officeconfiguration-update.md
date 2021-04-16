---
title: "Update officeConfiguration"
description: "Update the properties of an officeConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update officeConfiguration
Namespace: microsoft.graph



Update the properties of an [officeConfiguration](../resources/officeconfiguration.md) object.

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
PATCH /officeConfiguration
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [officeConfiguration](../resources/officeconfiguration.md) object.

The following table shows the properties that are required when you update the [officeConfiguration](../resources/officeconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|tenantCheckinStatuses|[officeClientCheckinStatus](../resources/officeclientcheckinstatus.md) collection|**TODO: Add Description**|
|tenantUserCheckinSummary|[officeUserCheckinSummary](../resources/officeusercheckinsummary.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [officeConfiguration](../resources/officeconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_officeconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/officeConfiguration
Content-Type: application/json
Content-length: 279

{
  "@odata.type": "#microsoft.graph.officeConfiguration",
  "tenantCheckinStatuses": [
    {
      "@odata.type": "microsoft.graph.officeClientCheckinStatus"
    }
  ],
  "tenantUserCheckinSummary": {
    "@odata.type": "microsoft.graph.officeUserCheckinSummary"
  }
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
  "@odata.type": "#microsoft.graph.officeConfiguration",
  "tenantCheckinStatuses": [
    {
      "@odata.type": "microsoft.graph.officeClientCheckinStatus"
    }
  ],
  "tenantUserCheckinSummary": {
    "@odata.type": "microsoft.graph.officeUserCheckinSummary"
  }
}
```


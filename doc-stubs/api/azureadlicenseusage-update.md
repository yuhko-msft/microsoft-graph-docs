---
title: "Update azureADLicenseUsage"
description: "Update the properties of an azureADLicenseUsage object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update azureADLicenseUsage
Namespace: microsoft.graph



Update the properties of an [azureADLicenseUsage](../resources/azureadlicenseusage.md) object.

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
PATCH /azureADLicenseUsage
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [azureADLicenseUsage](../resources/azureadlicenseusage.md) object.

The following table shows the properties that are required when you update the [azureADLicenseUsage](../resources/azureadlicenseusage.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|licenseInfoDetails|[licenseInfoDetail](../resources/licenseinfodetail.md) collection|**TODO: Add Description**|
|snapshotDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [azureADLicenseUsage](../resources/azureadlicenseusage.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_azureadlicenseusage"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/azureADLicenseUsage
Content-Type: application/json
Content-length: 211

{
  "@odata.type": "#microsoft.graph.azureADLicenseUsage",
  "licenseInfoDetails": [
    {
      "@odata.type": "microsoft.graph.licenseInfoDetail"
    }
  ],
  "snapshotDateTime": "String (timestamp)"
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
  "@odata.type": "#microsoft.graph.azureADLicenseUsage",
  "id": "1dcb3bf5-3bf5-1dcb-f53b-cb1df53bcb1d",
  "licenseInfoDetails": [
    {
      "@odata.type": "microsoft.graph.licenseInfoDetail"
    }
  ],
  "snapshotDateTime": "String (timestamp)"
}
```


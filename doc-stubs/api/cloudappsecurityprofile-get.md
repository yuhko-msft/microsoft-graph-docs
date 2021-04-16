---
title: "Get cloudAppSecurityProfile"
description: "Read the properties and relationships of a cloudAppSecurityProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get cloudAppSecurityProfile
Namespace: microsoft.graph



Read the properties and relationships of a [cloudAppSecurityProfile](../resources/cloudappsecurityprofile.md) object.

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
GET /security/cloudAppSecurityProfiles/{cloudAppSecurityProfileId}
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

If successful, this method returns a `200 OK` response code and a [cloudAppSecurityProfile](../resources/cloudappsecurityprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_cloudappsecurityprofile"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/security/cloudAppSecurityProfiles/{cloudAppSecurityProfileId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.cloudAppSecurityProfile"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.cloudAppSecurityProfile",
    "id": "8c8f1580-1580-8c8f-8015-8f8c80158f8c",
    "azureSubscriptionId": "String",
    "azureTenantId": "String",
    "createdDateTime": "String (timestamp)",
    "deploymentPackageUrl": "String",
    "destinationServiceName": "String",
    "isSigned": "Boolean",
    "lastModifiedDateTime": "String (timestamp)",
    "manifest": "String",
    "name": "String",
    "permissionsRequired": "String",
    "platform": "String",
    "policyName": "String",
    "publisher": "String",
    "riskScore": "String",
    "tags": [
      "String"
    ],
    "type": "String",
    "vendorInformation": {
      "@odata.type": "microsoft.graph.securityVendorInformation"
    }
  }
}
```


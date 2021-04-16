---
title: "Update userSecurityProfile"
description: "Update the properties of a userSecurityProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update userSecurityProfile
Namespace: microsoft.graph



Update the properties of a [userSecurityProfile](../resources/usersecurityprofile.md) object.

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
PATCH /security/userSecurityProfiles/{userSecurityProfileId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userSecurityProfile](../resources/usersecurityprofile.md) object.

The following table shows the properties that are required when you update the [userSecurityProfile](../resources/usersecurityprofile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|accounts|[userAccount](../resources/useraccount.md) collection|**TODO: Add Description**|
|azureSubscriptionId|String|**TODO: Add Description**|
|azureTenantId|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|riskScore|String|**TODO: Add Description**|
|tags|String collection|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|
|vendorInformation|[securityVendorInformation](../resources/securityvendorinformation.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [userSecurityProfile](../resources/usersecurityprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_usersecurityprofile"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/security/userSecurityProfiles/{userSecurityProfileId}
Content-Type: application/json
Content-length: 433

{
  "@odata.type": "#microsoft.graph.userSecurityProfile",
  "accounts": [
    {
      "@odata.type": "microsoft.graph.userAccount"
    }
  ],
  "azureSubscriptionId": "String",
  "azureTenantId": "String",
  "displayName": "String",
  "riskScore": "String",
  "tags": [
    "String"
  ],
  "userPrincipalName": "String",
  "vendorInformation": {
    "@odata.type": "microsoft.graph.securityVendorInformation"
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
  "@odata.type": "#microsoft.graph.userSecurityProfile",
  "id": "9fa436b5-36b5-9fa4-b536-a49fb536a49f",
  "accounts": [
    {
      "@odata.type": "microsoft.graph.userAccount"
    }
  ],
  "azureSubscriptionId": "String",
  "azureTenantId": "String",
  "createdDateTime": "String (timestamp)",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "riskScore": "String",
  "tags": [
    "String"
  ],
  "userPrincipalName": "String",
  "vendorInformation": {
    "@odata.type": "microsoft.graph.securityVendorInformation"
  }
}
```


---
title: "Update domainSecurityProfile"
description: "Update the properties of a domainSecurityProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update domainSecurityProfile
Namespace: microsoft.graph



Update the properties of a [domainSecurityProfile](../resources/domainsecurityprofile.md) object.

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
PATCH /security/domainSecurityProfiles/{domainSecurityProfileId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [domainSecurityProfile](../resources/domainsecurityprofile.md) object.

The following table shows the properties that are required when you update the [domainSecurityProfile](../resources/domainsecurityprofile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|activityGroupNames|String collection|**TODO: Add Description**|
|azureSubscriptionId|String|**TODO: Add Description**|
|azureTenantId|String|**TODO: Add Description**|
|countHits|Int32|**TODO: Add Description**|
|countInOrg|Int32|**TODO: Add Description**|
|domainCategories|[reputationCategory](../resources/reputationcategory.md) collection|**TODO: Add Description**|
|domainRegisteredDateTime|DateTimeOffset|**TODO: Add Description**|
|firstSeenDateTime|DateTimeOffset|**TODO: Add Description**|
|lastSeenDateTime|DateTimeOffset|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|registrant|[domainRegistrant](../resources/domainregistrant.md)|**TODO: Add Description**|
|riskScore|String|**TODO: Add Description**|
|tags|String collection|**TODO: Add Description**|
|vendorInformation|[securityVendorInformation](../resources/securityvendorinformation.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [domainSecurityProfile](../resources/domainsecurityprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_domainsecurityprofile"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/security/domainSecurityProfiles/{domainSecurityProfileId}
Content-Type: application/json
Content-length: 735

{
  "@odata.type": "#microsoft.graph.domainSecurityProfile",
  "activityGroupNames": [
    "String"
  ],
  "azureSubscriptionId": "String",
  "azureTenantId": "String",
  "countHits": "Integer",
  "countInOrg": "Integer",
  "domainCategories": [
    {
      "@odata.type": "microsoft.graph.reputationCategory"
    }
  ],
  "domainRegisteredDateTime": "String (timestamp)",
  "firstSeenDateTime": "String (timestamp)",
  "lastSeenDateTime": "String (timestamp)",
  "name": "String",
  "registrant": {
    "@odata.type": "microsoft.graph.domainRegistrant"
  },
  "riskScore": "String",
  "tags": [
    "String"
  ],
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
  "@odata.type": "#microsoft.graph.domainSecurityProfile",
  "id": "ebe12352-2352-ebe1-5223-e1eb5223e1eb",
  "activityGroupNames": [
    "String"
  ],
  "azureSubscriptionId": "String",
  "azureTenantId": "String",
  "countHits": "Integer",
  "countInOrg": "Integer",
  "domainCategories": [
    {
      "@odata.type": "microsoft.graph.reputationCategory"
    }
  ],
  "domainRegisteredDateTime": "String (timestamp)",
  "firstSeenDateTime": "String (timestamp)",
  "lastSeenDateTime": "String (timestamp)",
  "name": "String",
  "registrant": {
    "@odata.type": "microsoft.graph.domainRegistrant"
  },
  "riskScore": "String",
  "tags": [
    "String"
  ],
  "vendorInformation": {
    "@odata.type": "microsoft.graph.securityVendorInformation"
  }
}
```


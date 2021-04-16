---
title: "Update fileSecurityProfile"
description: "Update the properties of a fileSecurityProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update fileSecurityProfile
Namespace: microsoft.graph



Update the properties of a [fileSecurityProfile](../resources/filesecurityprofile.md) object.

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
PATCH /security/fileSecurityProfiles/{fileSecurityProfileId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [fileSecurityProfile](../resources/filesecurityprofile.md) object.

The following table shows the properties that are required when you update the [fileSecurityProfile](../resources/filesecurityprofile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|activityGroupNames|String collection|**TODO: Add Description**|
|azureSubscriptionId|String|**TODO: Add Description**|
|azureTenantId|String|**TODO: Add Description**|
|certificateThumbprint|String|**TODO: Add Description**|
|extensions|String collection|**TODO: Add Description**|
|fileType|String|**TODO: Add Description**|
|firstSeenDateTime|DateTimeOffset|**TODO: Add Description**|
|hashes|[fileHash](../resources/filehash.md) collection|**TODO: Add Description**|
|lastSeenDateTime|DateTimeOffset|**TODO: Add Description**|
|malwareStates|[malwareState](../resources/malwarestate.md) collection|**TODO: Add Description**|
|names|String collection|**TODO: Add Description**|
|riskScore|String|**TODO: Add Description**|
|size|Int64|**TODO: Add Description**|
|tags|String collection|**TODO: Add Description**|
|vendorInformation|[securityVendorInformation](../resources/securityvendorinformation.md)|**TODO: Add Description**|
|vulnerabilityStates|[vulnerabilityState](../resources/vulnerabilitystate.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [fileSecurityProfile](../resources/filesecurityprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_filesecurityprofile"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/security/fileSecurityProfiles/{fileSecurityProfileId}
Content-Type: application/json
Content-length: 864

{
  "@odata.type": "#microsoft.graph.fileSecurityProfile",
  "activityGroupNames": [
    "String"
  ],
  "azureSubscriptionId": "String",
  "azureTenantId": "String",
  "certificateThumbprint": "String",
  "extensions": [
    "String"
  ],
  "fileType": "String",
  "firstSeenDateTime": "String (timestamp)",
  "hashes": [
    {
      "@odata.type": "microsoft.graph.fileHash"
    }
  ],
  "lastSeenDateTime": "String (timestamp)",
  "malwareStates": [
    {
      "@odata.type": "microsoft.graph.malwareState"
    }
  ],
  "names": [
    "String"
  ],
  "riskScore": "String",
  "size": "Integer",
  "tags": [
    "String"
  ],
  "vendorInformation": {
    "@odata.type": "microsoft.graph.securityVendorInformation"
  },
  "vulnerabilityStates": [
    {
      "@odata.type": "microsoft.graph.vulnerabilityState"
    }
  ]
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
  "@odata.type": "#microsoft.graph.fileSecurityProfile",
  "id": "95340453-0453-9534-5304-349553043495",
  "activityGroupNames": [
    "String"
  ],
  "azureSubscriptionId": "String",
  "azureTenantId": "String",
  "certificateThumbprint": "String",
  "extensions": [
    "String"
  ],
  "fileType": "String",
  "firstSeenDateTime": "String (timestamp)",
  "hashes": [
    {
      "@odata.type": "microsoft.graph.fileHash"
    }
  ],
  "lastSeenDateTime": "String (timestamp)",
  "malwareStates": [
    {
      "@odata.type": "microsoft.graph.malwareState"
    }
  ],
  "names": [
    "String"
  ],
  "riskScore": "String",
  "size": "Integer",
  "tags": [
    "String"
  ],
  "vendorInformation": {
    "@odata.type": "microsoft.graph.securityVendorInformation"
  },
  "vulnerabilityStates": [
    {
      "@odata.type": "microsoft.graph.vulnerabilityState"
    }
  ]
}
```


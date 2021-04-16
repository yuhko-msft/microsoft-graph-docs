---
title: "List fileSecurityProfiles"
description: "Get a list of the fileSecurityProfile objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List fileSecurityProfiles
Namespace: microsoft.graph



Get a list of the [fileSecurityProfile](../resources/filesecurityprofile.md) objects and their properties.

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
GET /security/fileSecurityProfiles
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

If successful, this method returns a `200 OK` response code and a collection of [fileSecurityProfile](../resources/filesecurityprofile.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_filesecurityprofile"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/security/fileSecurityProfiles
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.fileSecurityProfile)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
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
  ]
}
```


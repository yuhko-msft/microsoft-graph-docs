---
title: "List appleUserInitiatedEnrollmentProfiles"
description: "Get the appleUserInitiatedEnrollmentProfile resources from the appleUserInitiatedEnrollmentProfiles navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List appleUserInitiatedEnrollmentProfiles
Namespace: microsoft.graph



Get the appleUserInitiatedEnrollmentProfile resources from the appleUserInitiatedEnrollmentProfiles navigation property.

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
GET /deviceManagement/appleUserInitiatedEnrollmentProfiles
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

If successful, this method returns a `200 OK` response code and a collection of [appleUserInitiatedEnrollmentProfile](../resources/appleuserinitiatedenrollmentprofile.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_appleuserinitiatedenrollmentprofile"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/appleUserInitiatedEnrollmentProfiles
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.appleUserInitiatedEnrollmentProfile)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.appleUserInitiatedEnrollmentProfile",
      "id": "a7797890-7890-a779-9078-79a7907879a7",
      "availableEnrollmentTypeOptions": [
        {
          "@odata.type": "microsoft.graph.appleOwnerTypeEnrollmentType"
        }
      ],
      "createdDateTime": "String (timestamp)",
      "defaultEnrollmentType": "String",
      "description": "String",
      "displayName": "String",
      "lastModifiedDateTime": "String (timestamp)",
      "platform": "String",
      "priority": "Integer"
    }
  ]
}
```


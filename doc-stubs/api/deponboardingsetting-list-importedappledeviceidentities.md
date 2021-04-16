---
title: "List importedAppleDeviceIdentities"
description: "Get the importedAppleDeviceIdentity resources from the importedAppleDeviceIdentities navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List importedAppleDeviceIdentities
Namespace: microsoft.graph



Get the importedAppleDeviceIdentity resources from the importedAppleDeviceIdentities navigation property.

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
GET /deviceManagement/depOnboardingSettings/{depOnboardingSettingId}/importedAppleDeviceIdentities
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

If successful, this method returns a `200 OK` response code and a collection of [importedAppleDeviceIdentity](../resources/importedappledeviceidentity.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_importedappledeviceidentity"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/depOnboardingSettings/{depOnboardingSettingId}/importedAppleDeviceIdentities
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.importedAppleDeviceIdentity)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.importedAppleDeviceIdentity",
      "id": "d736fa09-fa09-d736-09fa-36d709fa36d7",
      "createdDateTime": "String (timestamp)",
      "description": "String",
      "discoverySource": "String",
      "enrollmentState": "String",
      "isDeleted": "Boolean",
      "isSupervised": "Boolean",
      "lastContactedDateTime": "String (timestamp)",
      "platform": "String",
      "requestedEnrollmentProfileAssignmentDateTime": "String (timestamp)",
      "requestedEnrollmentProfileId": "String",
      "serialNumber": "String"
    }
  ]
}
```


---
title: "Create legalHold"
description: "Create a new legalHold object."
author: "mahage-msft"
ms.localizationpriority: medium
ms.prod: "ediscovery"
doc_type: resourcePageType
---

# Create legalHold

Namespace: microsoft.graph.ediscovery

Create a new [legalHold](../resources/ediscovery-legalhold.md) object.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|eDiscovery.Read.All, eDiscovery.ReadWrite.All|
|Delegated (personal Microsoft account)|Not supported.|
|Application|Not supported.|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->

``` http
POST /compliance/ediscovery/cases/{caseId}/legalHolds
```

## Request headers

|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body

In the request body, supply a JSON representation of the [legalHold](../resources/ediscovery-legalhold.md) object.

The following table shows the properties that are required when you create a [legalHold](../resources/ediscovery-legalhold.md).

|Property|Type|Description|
|:---|:---|:---|
|displayName|String| The display name of the legal hold. |

## Response

If successful, this method returns a `201 Created` response code and a [microsoft.graph.ediscovery.legalHold](../resources/ediscovery-legalhold.md) object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_legalhold_from_"
}
-->

``` http
POST https://graph.microsoft.com/v1.0/compliance/ediscovery/cases/636490b0-2563-46e0-841a-d57504a074d5/legalHolds
Content-Type: application/json
Content-length: 295

{
  "description": "New Legal Hold Description",
  "isEnabled": "true",
  "contentQuery": "subject:'Quarterly Financials'",
  "displayName": "New Legal Hold"
}
```

### Response

**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.ediscovery.legalHold"
}
-->

``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
    "@odata.context": "https://graph.microsoft.com/v1.0/$metadata#compliance/ediscovery/cases('197e208f-cc2d-4b73-8f99-18b27be4c282')/legalHolds/$entity",
    "description": "New Legal Hold Description",
    "lastModifiedDateTime": "2021-10-28T00:41:55.897Z",
    "isEnabled": true,
    "status": "Pending",
    "contentQuery": "subject:'Quarterly Financials'",
    "errors": [],
    "id": "12bbe7d3-7e38-4bfb-9083-0dce440a16e6",
    "displayName": "New Legal Holdd",
    "createdDateTime": "2021-10-28T00:41:55.897Z",
    "createdBy": {
        "user": {
            "id": null,
            "displayName": "Edisco Admin"
        }
    },
    "lastModifiedBy": {
        "user": {
            "id": null,
            "displayName": "Edisco Admin"
        }
    }
}
```

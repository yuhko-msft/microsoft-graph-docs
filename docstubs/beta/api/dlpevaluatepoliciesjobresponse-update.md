---
title: "Update dlpEvaluatePoliciesJobResponse"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update dlpEvaluatePoliciesJobResponse

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a dlpEvaluatePoliciesJobResponse object.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

| Permission type                        | Permissions (from most to least privileged) |
| :------------------------------------- | :------------------------------------------ |
| Delegated (work or school account)     |                                             |
| Delegated (personal Microsoft account) |                                             |
| Application                            |                                             |

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->

```http

```

## Request headers

| Name          | Description                 |
| :------------ | :-------------------------- |
| Authorization | Bearer {token}. Required.   |
| Content-Type  | application/json. Required. |

## Request Body

In the request body, supply JSON representation of the [dlpEvaluatePoliciesJobResponse](../resources/-dlpevaluatepoliciesjobresponse.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a dlpEvaluatePoliciesJobResponse object.

| Property | Type                                                         | Description |
| :------- | :----------------------------------------------------------- | :---------- |
| result   | [dlpPoliciesJobResult](../resources/dlppoliciesjobresult.md) |             |

## Response

If successful, this method returns a `200 OK` response code and a dlpEvaluatePoliciesJobResponse object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_dlpevaluatepoliciesjobresponse"
}
-->

```http
PATCH https://graph.microsoft.com/beta

Content-Type: application/json
Content-Length: 826

{
  "@odata.type": "#microsoft.graph.dlpEvaluatePoliciesJobResponse",
  "creationDateTime": "DateTimeOffset",
  "endDateTime": "DateTimeOffset",
  "result": {
    "@odata.type": "#microsoft.graph.dlpPoliciesJobResult",
    "matchingRules": [
      {
        "@odata.type": "#microsoft.graph.matchingDlpRule",
        "actions": [
          {
            "@odata.type": "#microsoft.graph.dlpActionInfo",
            "action": "String"
          }
        ],
        "isMostRestrictive": "Boolean",
        "policyId": "String",
        "policyName": "String",
        "priority": "Int32",
        "ruleId": "String",
        "ruleMode": "String",
        "ruleName": "String"
      }
    ]
  },
  "startDateTime": "DateTimeOffset",
  "status": "String",
  "tenantId": "String",
  "type": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.dataClassificationService.contract.dlpEvaluatePoliciesJobResponse"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.dlpEvaluatePoliciesJobResponse",
  "creationDateTime": "DateTimeOffset",
  "endDateTime": "DateTimeOffset",
  "id": "String(identifier)",
  "result": {
    "@odata.type": "#microsoft.graph.dlpPoliciesJobResult",
    "matchingRules": [
      {
        "@odata.type": "#microsoft.graph.matchingDlpRule",
        "actions": [
          {
            "@odata.type": "#microsoft.graph.dlpActionInfo",
            "action": "String"
          }
        ],
        "isMostRestrictive": "Boolean",
        "policyId": "String",
        "policyName": "String",
        "priority": "Int32",
        "ruleId": "String",
        "ruleMode": "String",
        "ruleName": "String"
      }
    ]
  },
  "startDateTime": "DateTimeOffset",
  "status": "String",
  "tenantId": "String",
  "type": "String"
}
}

```

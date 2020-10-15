---
title: "Update evaluateLabelsAndPoliciesJobResponse"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update evaluateLabelsAndPoliciesJobResponse

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an evaluateLabelsAndPoliciesJobResponse object.

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

In the request body, supply JSON representation of the [evaluateLabelsAndPoliciesJobResponse](../resources/-evaluatelabelsandpoliciesjobresponse.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create an evaluateLabelsAndPoliciesJobResponse object.

| Property | Type                                                                               | Description |
| :------- | :--------------------------------------------------------------------------------- | :---------- |
| result   | [evaluateLabelsAndPoliciesResult](../resources/evaluatelabelsandpoliciesresult.md) |             |

## Response

If successful, this method returns a `200 OK` response code and an evaluateLabelsAndPoliciesJobResponse object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_evaluatelabelsandpoliciesjobresponse"
}
-->

```http
PATCH https://graph.microsoft.com/beta

Content-Type: application/json
Content-Length: 4895

{
  "@odata.type": "#microsoft.graph.evaluateLabelsAndPoliciesJobResponse",
  "creationDateTime": "DateTimeOffset",
  "endDateTime": "DateTimeOffset",
  "result": {
    "@odata.type": "#microsoft.graph.evaluateLabelsAndPoliciesResult",
    "classificationResult": {
      "@odata.type": "#microsoft.graph.detectedSensitiveContentWrapper",
      "classification": [
        {
          "@odata.type": "#microsoft.graph.detectedSensitiveContent",
          "classificationAttributes": [
            {
              "@odata.type": "#microsoft.graph.classificationAttribute",
              "confidence": "Int32",
              "count": "Int32"
            }
          ],
          "classificationMethod": "String",
          "confidence": "Int32",
          "displayName": "String",
          "id": "String(identifier)",
          "matches": [
            {
              "@odata.type": "#microsoft.graph.sensitiveContentLocation",
              "confidence": "Int32",
              "evidences": [
                {
                  "@odata.type": "#microsoft.graph.sensitiveContentEvidence",
                  "length": "Int32",
                  "match": "String",
                  "offset": "Int32"
                }
              ],
              "idMatch": "String",
              "length": "Int32",
              "offset": "Int32"
            }
          ],
          "recommendedConfidence": "Int32",
          "scope": "String",
          "sensitiveTypeSource": "String",
          "uniqueCount": "Int32"
        }
      ]
    },
    "dataLossPreventionPoliciesResult": {
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
    "sensitivityLabelsResult": {
      "@odata.type": "#microsoft.graph.evaluateLabelJobResultGroup",
      "automatic": {
        "@odata.type": "#microsoft.graph.evaluateLabelJobResult",
        "responsiblePolicy": {
          "@odata.type": "#microsoft.graph.responsiblePolicy",
          "id": "String(identifier)",
          "name": "String"
        },
        "responsibleSensitiveTypes": [
          {
            "@odata.type": "#microsoft.graph.responsibleSensitiveType",
            "description": "String",
            "id": "String(identifier)",
            "name": "String",
            "publisherName": "String",
            "rulePackageId": "String",
            "rulePackageType": "String"
          }
        ],
        "sensitivityLabel": {
          "@odata.type": "#microsoft.graph.matchingLabel",
          "applicationMode": "String",
          "description": "String",
          "displayName": "String",
          "id": "String(identifier)",
          "isEndpointProtectionEnabled": "Boolean",
          "labelActions": [
            {
              "@odata.type": "#microsoft.graph.encryptContent"
            }
          ],
          "name": "String",
          "policyTip": "String",
          "priority": "Int32",
          "toolTip": "String"
        }
      },
      "recommended": {
        "@odata.type": "#microsoft.graph.evaluateLabelJobResult",
        "responsiblePolicy": {
          "@odata.type": "#microsoft.graph.responsiblePolicy",
          "id": "String(identifier)",
          "name": "String"
        },
        "responsibleSensitiveTypes": [
          {
            "@odata.type": "#microsoft.graph.responsibleSensitiveType",
            "description": "String",
            "id": "String(identifier)",
            "name": "String",
            "publisherName": "String",
            "rulePackageId": "String",
            "rulePackageType": "String"
          }
        ],
        "sensitivityLabel": {
          "@odata.type": "#microsoft.graph.matchingLabel",
          "applicationMode": "String",
          "description": "String",
          "displayName": "String",
          "id": "String(identifier)",
          "isEndpointProtectionEnabled": "Boolean",
          "labelActions": [
            {
              "@odata.type": "#microsoft.graph.encryptContent"
            }
          ],
          "name": "String",
          "policyTip": "String",
          "priority": "Int32",
          "toolTip": "String"
        }
      }
    }
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
  "@odata.type": "microsoft.dataClassificationService.contract.evaluateLabelsAndPoliciesJobResponse"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.evaluateLabelsAndPoliciesJobResponse",
  "creationDateTime": "DateTimeOffset",
  "endDateTime": "DateTimeOffset",
  "id": "String(identifier)",
  "result": {
    "@odata.type": "#microsoft.graph.evaluateLabelsAndPoliciesResult",
    "classificationResult": {
      "@odata.type": "#microsoft.graph.detectedSensitiveContentWrapper",
      "classification": [
        {
          "@odata.type": "#microsoft.graph.detectedSensitiveContent",
          "classificationAttributes": [
            {
              "@odata.type": "#microsoft.graph.classificationAttribute",
              "confidence": "Int32",
              "count": "Int32"
            }
          ],
          "classificationMethod": "String",
          "confidence": "Int32",
          "displayName": "String",
          "id": "String(identifier)",
          "matches": [
            {
              "@odata.type": "#microsoft.graph.sensitiveContentLocation",
              "confidence": "Int32",
              "evidences": [
                {
                  "@odata.type": "#microsoft.graph.sensitiveContentEvidence",
                  "length": "Int32",
                  "match": "String",
                  "offset": "Int32"
                }
              ],
              "idMatch": "String",
              "length": "Int32",
              "offset": "Int32"
            }
          ],
          "recommendedConfidence": "Int32",
          "scope": "String",
          "sensitiveTypeSource": "String",
          "uniqueCount": "Int32"
        }
      ]
    },
    "dataLossPreventionPoliciesResult": {
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
    "sensitivityLabelsResult": {
      "@odata.type": "#microsoft.graph.evaluateLabelJobResultGroup",
      "automatic": {
        "@odata.type": "#microsoft.graph.evaluateLabelJobResult",
        "responsiblePolicy": {
          "@odata.type": "#microsoft.graph.responsiblePolicy",
          "id": "String(identifier)",
          "name": "String"
        },
        "responsibleSensitiveTypes": [
          {
            "@odata.type": "#microsoft.graph.responsibleSensitiveType",
            "description": "String",
            "id": "String(identifier)",
            "name": "String",
            "publisherName": "String",
            "rulePackageId": "String",
            "rulePackageType": "String"
          }
        ],
        "sensitivityLabel": {
          "@odata.type": "#microsoft.graph.matchingLabel",
          "applicationMode": "String",
          "description": "String",
          "displayName": "String",
          "id": "String(identifier)",
          "isEndpointProtectionEnabled": "Boolean",
          "labelActions": [
            {
              "@odata.type": "#microsoft.graph.encryptContent"
            }
          ],
          "name": "String",
          "policyTip": "String",
          "priority": "Int32",
          "toolTip": "String"
        }
      },
      "recommended": {
        "@odata.type": "#microsoft.graph.evaluateLabelJobResult",
        "responsiblePolicy": {
          "@odata.type": "#microsoft.graph.responsiblePolicy",
          "id": "String(identifier)",
          "name": "String"
        },
        "responsibleSensitiveTypes": [
          {
            "@odata.type": "#microsoft.graph.responsibleSensitiveType",
            "description": "String",
            "id": "String(identifier)",
            "name": "String",
            "publisherName": "String",
            "rulePackageId": "String",
            "rulePackageType": "String"
          }
        ],
        "sensitivityLabel": {
          "@odata.type": "#microsoft.graph.matchingLabel",
          "applicationMode": "String",
          "description": "String",
          "displayName": "String",
          "id": "String(identifier)",
          "isEndpointProtectionEnabled": "Boolean",
          "labelActions": [
            {
              "@odata.type": "#microsoft.graph.encryptContent"
            }
          ],
          "name": "String",
          "policyTip": "String",
          "priority": "Int32",
          "toolTip": "String"
        }
      }
    }
  },
  "startDateTime": "DateTimeOffset",
  "status": "String",
  "tenantId": "String",
  "type": "String"
}
}

```
